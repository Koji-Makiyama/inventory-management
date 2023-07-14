import { Table } from "@trussworks/react-uswds";

export default function CustomerOrderPartsTable({ tableData }) {
    return (
        <>
            <Table striped fullWidth className="bg-primary-lighter">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Order Id</th>
                    </tr>
                </thead>
                <tbody>
                    {tableData.map((employee) => {
                        return (
                            <tr key={employee.id}>
                                <td>{employee.id}</td>
                                <td>{employee.firstName}</td>
                            </tr>
                        );
                    })}
                </tbody>
            </Table>
        </>
    );
}