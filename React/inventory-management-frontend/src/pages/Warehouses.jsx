import { Grid, GridContainer, Modal, ModalHeading, ModalToggleButton } from "@trussworks/react-uswds";
import { useEffect, useRef, useState } from "react";
import WarehousesTable from "../components/Warehouses/WarehousesTable";
import WarehousesGetForm from "../components/Warehouses/WarehousesGetForm";
import WarehousesUpdateForm from "../components/Warehouses/WarehousesUpdateForm";
import WarehousesDeleteForm from "../components/Warehouses/WarehousesDeleteForm";

export default function Warehouses() {

    const url = 'http://localhost:8080/warehouses';

    const [warehouses, setWarehouses] = useState([]);
    const modalRef1 = useRef(null);
    const modalRef2 = useRef(null);
    const modalRef3 = useRef(null);

    useEffect(() => {
        fetch(url)
        .then(data => data.json())
        .then(returnedData => {
            setWarehouses(returnedData);
        })
        .catch(error => console.error(error))
    }, []);

    function addNewWarehouse(newWarehouse) {
        setWarehouses((prevState) => {
            return [...prevState, newWarehouse];
        });
    }

    function updateWarehouse(newWarehouse) {
        setWarehouses((prevState) => {
            return [...prevState, newWarehouse];
        });
    }

    function deleteWarehouse(inputWarehouse) {
        setWarehouses((prevState) => {
            return [...prevState, inputWarehouse];
        });
    }

    return(
        <>
            <GridContainer>
                <Grid col={10}>
                    <h1 className='text-centered'>All Warehouses</h1>
                </Grid>
                <Grid col={10}>
                    <ModalToggleButton modalRef={modalRef1} opener>Add Warehouse</ModalToggleButton>
                    <ModalToggleButton modalRef={modalRef2} opener>Update Warehouse</ModalToggleButton>
                    <ModalToggleButton modalRef={modalRef3} opener>Delete Warehouse</ModalToggleButton>
                </Grid>
                <Grid col>
                    <WarehousesTable tableData={warehouses}/>
                </Grid>
            </GridContainer>

            <Modal id='warehouse-form-modal' ref={modalRef1}>
                <ModalHeading id='warehouse-form-modal-heading'>Enter New Warehouse Details</ModalHeading>
                <WarehousesGetForm addNewWarehouse={addNewWarehouse} />
            </Modal>
            <Modal id='warehouse-form-modal' ref={modalRef2}>
                <ModalHeading id='warehouse-form-modal-heading'>Update Warehouse Details</ModalHeading>
                <WarehousesUpdateForm updateWarehouse={updateWarehouse} />
            </Modal>
            <Modal id='warehouse-form-modal' ref={modalRef3}>
                <ModalHeading id='warehouse-form-modal-heading'>Delete Warehouse</ModalHeading>
                <WarehousesDeleteForm deleteWarehouse={deleteWarehouse} />
            </Modal>
        </>
    )
}