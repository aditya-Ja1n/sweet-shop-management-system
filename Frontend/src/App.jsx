import { BrowserRouter, Routes, Route } from "react-router-dom";
import Navbar from "./components/Navbar.jsx";
import Login from "./pages/Login.jsx";
import Sweets from "./pages/Sweets.jsx";
import AddSweet from "./pages/AddSweet.jsx";

function App() {
    return (
        <BrowserRouter>
            <Navbar />
            <Routes>
                <Route path="/" element={<Sweets />} />
                <Route path="/login" element={<Login />} />
                <Route path="/sweets" element={<Sweets />} />
                <Route path="/add-sweet" element={<AddSweet />} />
            </Routes>
        </BrowserRouter>
    );
}

export default App;
