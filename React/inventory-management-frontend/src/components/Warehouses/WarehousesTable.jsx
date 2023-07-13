import { Table } from "@trussworks/react-uswds";

export default function WarehousesTable({tableData}) {
    return(
        <>
            <Table striped fullWidth className="bg-primary-lighter">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Location</th>
                    </tr>
                </thead>
                <tbody>
                    {tableData.map((warehouse) => {
                        return (
                            <tr key={warehouse.id}>
                                <td>{warehouse.id}</td>
                                <td>{warehouse.location}</td>
                            </tr>
                        );
                    })}
                </tbody>
            </Table>
        </>
    );
}