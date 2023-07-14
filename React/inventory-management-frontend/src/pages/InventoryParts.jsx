import { Grid, GridContainer, Modal, ModalHeading, ModalToggleButton } from "@trussworks/react-uswds";
import { useEffect, useRef, useState } from "react";
import InventoryPartsTable from "../components/InventoryParts/InventoryPartsTable";
import EmployeesGetForm from "../components/Employees/EmployeesCreateForm";
import EmployeesUpdateForm from "../components/Employees/EmployeesUpdateForm";
import EmployeesDeleteForm from "../components/Employees/EmployeesDeleteForm";

export default function InventoryParts() {

    const url = 'http://localhost:8080/inventory-parts';

    const [employees, setEmployees] = useState([]);
    const modalRef1 = useRef(null);
    const modalRef2 = useRef(null);
    const modalRef3 = useRef(null);

    useEffect(() => {
        fetch(url)
        .then(data => data.json())
        .then(returnedData => {
            setEmployees(returnedData);
        })
        .catch(error => console.error(error))
    }, []);

    function addNewEmployee(newEmployee) {
        setEmployees((prevState) => {
            return [...prevState, newEmployee];
        });
    }

    function updateEmployee(employeeUpdates) {
        setEmployees((prevState) => {
            return [...prevState, employeeUpdates];
        });
    }

    function deleteEmployee(specifiedEmployee) {
        setEmployees((prevState) => {
            return [...prevState, specifiedEmployee];
        });
    }

    return(
        <>
            <GridContainer>
                <Grid col={10}>
                    <h1 className='text-centered'>All Inventory Parts</h1>
                </Grid>
                <Grid col={10}>
                    <ModalToggleButton modalRef={modalRef1} opener>Add Inventory Parts</ModalToggleButton>
                    <ModalToggleButton modalRef={modalRef2} opener>Update Inventory Parts</ModalToggleButton>
                    <ModalToggleButton modalRef={modalRef3} opener>Delete Inventory Parts</ModalToggleButton>
                </Grid>
                <Grid col>
                    <InventoryPartsTable tableData={employees}/>
                </Grid>
            </GridContainer>

            <Modal id='employee-form-modal' ref={modalRef1}>
                <ModalHeading id='employee-form-modal-heading'>Enter New Employee Details</ModalHeading>
                <EmployeesGetForm addNewEmployee={addNewEmployee} />
            </Modal>
            <Modal id='employee-form-modal' ref={modalRef2}>
                <ModalHeading id='employee-form-modal-heading'>Update Employee Details</ModalHeading>
                <EmployeesUpdateForm updateEmployee={updateEmployee} />
            </Modal>
            <Modal id='employee-form-modal' ref={modalRef3}>
                <ModalHeading id='employee-form-modal-heading'>Delete Employee</ModalHeading>
                <EmployeesDeleteForm deleteEmployee={deleteEmployee} />
            </Modal>
        </>
    )
}