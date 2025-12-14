import { Link } from "react-router-dom";

export default function Navbar() {
    return (
        <nav style={{
            padding: "12px",
            background: "#222",
            color: "#fff",
            display: "flex",
            gap: "16px"
        }}>
            <Link style={{ color: "white" }} to="/sweets">Sweets</Link>
            <Link style={{ color: "white" }} to="/add-sweet">Add Sweet</Link>
            <Link style={{ color: "white" }} to="/login">Login</Link>
        </nav>
    );
}
