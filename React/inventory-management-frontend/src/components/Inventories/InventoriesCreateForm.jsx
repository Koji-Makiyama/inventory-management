import { Button, Form, Label, TextInput } from "@trussworks/react-uswds";

export default function InventoriesCreateForm({ addNewEmployee }) {

    function handleSubmit(event) {

        const url = 'http://localhost:8080/inventories';
        event.preventDefault();

        const data = new FormData(event.target);

        const newEmployee = {
            firstName: data.get('employeeFirst'),
            lastName: data.get('employeeLast'),
            hourlyRate: data.get('employeeRate'),
            warehouseId: data.get('employeeWarehouseId')
        }

        fetch(url + '/employee', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(newEmployee)
        })
            .then(data => data.json())
            .then(returnedData => {
                addNewEmployee(returnedData);
                event.target.reset();
            })
            .catch(error => console.error(error));
    }

    return (
        <>
            <Form onSubmit={handleSubmit}>

                <Label htmlFor="employee-create-input-first-name">Employee First Name</Label>
                <TextInput id="employee-create-input-first-name" name="employeeFirst" type="text"></TextInput>
                <Label htmlFor="employee-create-input-last-name">Employee Last Name</Label>
                <TextInput id="employee-create-input-last-name" name="employeeLast" type="text"></TextInput>
                <Label htmlFor="employee-create-input-hourly-rate">Employee Hourly Rate</Label>
                <TextInput id="employee-create-input-hourly-rate" name="employeeRate" type="text"></TextInput>
                <Label htmlFor="employee-create-input-warehouse-id">Employee Warehouse Id</Label>
                <TextInput id="employee-create-input-warehouse-id" name="employeeWarehouseId" type="text"></TextInput>
                <Button type="submit" data-close-modal="true">Submit</Button>
            </Form>
        </>
    )

}