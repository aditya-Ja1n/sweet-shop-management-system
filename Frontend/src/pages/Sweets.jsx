import { useEffect, useState } from "react";
import api from "../api/axios";

export default function Sweets() {
    const [sweets, setSweets] = useState([]);
    const [error, setError] = useState("");

    useEffect(() => {
        api.get("/sweets")
            .then(res => setSweets(res.data))
            .catch(() => setError("Unable to fetch sweets"));
    }, []);

    return (
        <div style={{ padding: "20px" }}>
            <h2>Sweets</h2>

            {error && <p style={{ color: "red" }}>{error}</p>}

            <ul>
                {sweets.map(s => (
                    <li key={s.id}>
                        {s.name} | ₹{s.price} | Qty: {s.quantity}
                    </li>
                ))}
            </ul>
        </div>
    );
}
