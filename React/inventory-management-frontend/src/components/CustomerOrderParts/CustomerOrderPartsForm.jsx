import { Button, Form, Label, TextInput } from "@trussworks/react-uswds";

export default function WarehousesForm({ addNewWarehouse }) {

    function handleSubmit(event) {

        const url = 'http://localhost:8080/warehouses';
        event.preventDefault();

        const data = new FormData(event.target);

        const newWarehouse = {
            location: data.get('warehouseLocation')
        }

        fetch(url + '/warehouse', {
            method: 'POST',
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
                <Label htmlFor="warehouse-location-input">Warehouse Location</Label>
                <TextInput id="warehouse-location-input" name="warehouseLocation" type="text"></TextInput>
                <Button type="submit" data-close-modal="true">Submit</Button>
            </Form>
        </>
    )

}