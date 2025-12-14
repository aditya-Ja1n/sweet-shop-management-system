export default function AddSweet() {
    return (
        <div style={{ padding: "20px" }}>
            <h2>Add Sweet</h2>

            <form>
                <input placeholder="Name" /><br /><br />
                <input placeholder="Category" /><br /><br />
                <input placeholder="Price" /><br /><br />
                <input placeholder="Quantity" /><br /><br />
                <button type="button">Add</button>
            </form>
        </div>
    );
}
