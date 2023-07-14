import { Button, Form, Label, TextInput } from "@trussworks/react-uswds";

export default function CustomersForm({ addNewWarehouse }) {

    function handleSubmit(event) {

        const url = 'http://localhost:8080/warehouses';
        event.preventDefault();

        const data = new FormData(event.target);

        const newWarehouse = {
            location: data.get('warehouseLocation')
        }

        fetch(url + '/employee/put', {
            method: 'PUT',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(newWarehouse)
        })
            .then(data => data.json())
            .then(returnedData => {
                addNewWarehouse(returnedData);
                event.target.reset();
            })
            .catch(error => console.error(error));
    }

    return (
        <>
            <Form onSubmit={handleSubmit}>
            <Label htmlFor="employee-update-input-id">Employee Id</Label>
                <TextInput id="employee-update-input-id" name="employeeId" type="text"></TextInput>
                <Label htmlFor="employee-update-input-first-name">Employee First Name</Label>
                <TextInput id="employee-update-input-first-name" name="employeeFirst" type="text"></TextInput>
                <Label htmlFor="employee-update-input-last-name">Employee Last Name</Label>
                <TextInput id="employee-update-input-last-name" name="employeeLast" type="text"></TextInput>
                <Label htmlFor="employee-update-input-hourly-rate">Employee Hourly Rate</Label>
                <TextInput id="employee-update-input-hourly-rate" name="employeeRate" type="text"></TextInput>
                <Button type="submit" data-close-modal="true">Submit</Button>
            </Form>
        </>
    )

}