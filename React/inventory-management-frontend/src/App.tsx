import './App.css'
import CustomerOrders from './components/CustomerOrders/CustomerOrders';
import Customers from './components/Customers/Customers';
import Employees from './components/Employees/Employees';
import Inventories from './components/Inventories/Inventories';
import InventoryParts from './components/InventoryParts/InventoryParts';
import OrderParts from './components/OrderParts/OrderParts';
import Warehouses from './components/Warehouses/Warehouses';

export default function App() {

    return (
        <>
            <h1>Hello From App.tsx h1!</h1>
            <Warehouses/>
            <OrderParts/>
            <InventoryParts/>
            <Inventories/>
            <Employees/>
            <Customers/>
            <CustomerOrders/>
        </>
    );
}
