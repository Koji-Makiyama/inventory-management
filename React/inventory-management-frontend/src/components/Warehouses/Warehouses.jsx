import { Grid, GridContainer, Modal, ModalHeading, ModalToggleButton } from "@trussworks/react-uswds";
import { useEffect, useRef, useState } from "react";
import WarehousesTable from "./WarehousesTable";
import WarehousesForm from "./WarehousesForm";

export default function Warehouses() {

    const url = 'http://localhost:8080/warehouses';

    const [warehouses, setWarehouses] = useState([]);
    const modalRef = useRef(null);

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

    return(
        <>
            <GridContainer>
                <Grid col={10}>
                    <h1 className='text-centered'>All Warehouses</h1>
                </Grid>
                <Grid col={10}>
                    <ModalToggleButton modalRef={modalRef} opener>New Warehouse</ModalToggleButton>
                </Grid>
                <Grid col>
                    <WarehousesTable tableData={warehouses}/>
                </Grid>
            </GridContainer>

            <Modal id='warehouse-form-modal' ref={modalRef}>
                <ModalHeading id='warehouse-form-modal-heading'>Enter New Warehouse Details</ModalHeading>
                <WarehousesForm addNewWarehouse={addNewWarehouse} />
            </Modal>
        </>
    )
}