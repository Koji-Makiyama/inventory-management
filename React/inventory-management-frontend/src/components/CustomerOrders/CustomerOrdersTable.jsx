import { Table } from "@trussworks/react-uswds";

export default function CustomerOrdersTable({ tableData }) {
    return (
        <>
            <Table striped fullWidth className="bg-primary-lighter">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Hourly Rate</th>
                        <th>Warehouse Id</th>
                    </tr>
                </thead>
                <tbody>
                    {tableData.map((employee) => {
                        return (
                            <tr key={employee.id}>
                                <td>{employee.id}</td>
                                <td>{employee.firstName}</td>
                                <td>{employee.lastName}</td>
                                <td>{employee.hourlyRate}</td>
                                <td>{employee.warehouseId}</td>
                            </tr>
                        );
                    })}
                </tbody>
            </Table>
        </>
    );
}