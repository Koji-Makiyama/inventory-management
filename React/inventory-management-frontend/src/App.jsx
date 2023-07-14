import '@trussworks/react-uswds/lib/index.css';
import { ExtendedNav, Grid, Header, PrimaryNav, Title } from '@trussworks/react-uswds';
import { BrowserRouter, Link, Route, Routes } from 'react-router-dom';
import Warehouses from './pages/Warehouses';
import Employees from './pages/Employees';
import Inventories from './pages/Inventories';
import InventoryParts from './pages/InventoryParts';
import Customers from './pages/Customers';
import CustomerOrders from './pages/CustomerOrders';
import CustomerOrderParts from './pages/CustomerOrderParts';
import Home from './pages/Home';

export default function App() {

    const navItems = [
        <Link to='/'>Home</Link>,
        <Link to='/warehouses'>Warehouses</Link>,
        <Link to='/employees'>Employees</Link>,
        <Link to='/inventories'>Inventories</Link>,
        <Link to='/inventory-parts'>Inventory Parts</Link>,
        <Link to='/customers'>Customers</Link>,
        <Link to='/customer-orders'>Customer Orders</Link>,
        <Link to='/customer-order-parts'>Customer Order Parts</Link>
    ];

    return (
        <>
            <Header>
                    <Title className='text-center'>Inventory Management</Title>
                    <hr />
            </Header>
            <BrowserRouter basename='/'>
                <Grid row>
                    <PrimaryNav items={navItems}></PrimaryNav>
                </Grid>
                <hr />
                <Routes>
                    <Route path='/' element={<Home />} />,
                    <Route path='/warehouses' element={<Warehouses />} />,
                    <Route path='/employees' element={<Employees />} />,
                    <Route path='/inventories' element={<Inventories />} />,
                    <Route path='/inventory-parts' element={<InventoryParts />} />,
                    <Route path='/customers' element={<Customers />} />,
                    <Route path='/customer-orders' element={<CustomerOrders />} />,
                    <Route path='/customer-order-parts' element={<CustomerOrderParts />} />
                </Routes>
            </BrowserRouter>

        </>
    );
}
