import { Table } from "@trussworks/react-uswds";

export default function CustomersTable({ tableData }) {
    return (
        <>
            <Table striped fullWidth className="bg-primary-lighter">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Orders</th>
                    </tr>
                </thead>
                <tbody>
                    {tableData.map((employee) => {
                        return (
                            <tr key={employee.id}>
                                <td>{employee.id}</td>
                                <td>{employee.firstName}</td>
                                <td>{employee.lastName}</td>
                            </tr>
                        );
                    })}
                </tbody>
            </Table>
        </>
    );
}