import { Button, Form, Label, TextInput } from "@trussworks/react-uswds";

export default function WarehousesUpdateForm({ updateWarehouse }) {

    function handleSubmit(event) {

        const url = 'http://localhost:8080/warehouses';
        event.preventDefault();

        const data = new FormData(event.target);

        const newWarehouse = {
            id: data.get('warehouseId'),
            location: data.get('warehouseLocation')
        }

        fetch(url + '/warehouse/put', {
            method: 'PUT',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(newWarehouse)
        })
            .then(data => data.json())
            .then(returnedData => {
                updateWarehouse(returnedData);
                event.target.reset();
            })
            .catch(error => console.error(error));
    }

    return (
        <>
            <Form onSubmit={handleSubmit}>
            <Label htmlFor="warehouse-id-input">Warehouse Id</Label>
                <TextInput id="warehouse-id-input" name="warehouseId" type="text"></TextInput>
                <Label htmlFor="warehouse-location-input">Warehouse Location</Label>
                <TextInput id="warehouse-location-input" name="warehouseLocation" type="text"></TextInput>
                <Button type="submit" data-close-modal="true">Submit</Button>
            </Form>
        </>
    )

}