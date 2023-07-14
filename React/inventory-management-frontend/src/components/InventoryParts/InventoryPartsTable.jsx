import { Table } from "@trussworks/react-uswds";

export default function InventoriesTable({ tableData }) {
    return (
        <>
            <Table striped fullWidth className="bg-primary-lighter">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Warehouse Id</th>
                    </tr>
                </thead>
                <tbody>
                    {tableData.map((employee) => {
                        return (
                            <tr key={employee.id}>
                                <td>{employee.id}</td>
                                <td>{employee.warehouseId}</td>
                            </tr>
                        );
                    })}
                </tbody>
            </Table>
        </>
    );
}