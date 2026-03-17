const API = "http://localhost:8080/coffees";

// listar cafés
async function getCoffees() {
  const res = await fetch(API);
  const data = await res.json();

  const list = document.getElementById("list");
  list.innerHTML = "";

  data.forEach(c => {
    const li = document.createElement("li");
    li.innerText = c.name;

    const btn = document.createElement("button");
    btn.innerText = "❌";
    btn.onclick = () => deleteCoffee(c.id);

    li.appendChild(btn);
    list.appendChild(li);
  });
}

// adicionar café
async function addCoffee() {
  const name = document.getElementById("name").value;

  await fetch(API, {
    method: "POST",
    headers: {
      "Content-Type": "application/json"
    },
    body: JSON.stringify({
      id: Date.now().toString(),
      name: name
    })
  });

  getCoffees();
}

// deletar café
async function deleteCoffee(id) {
  await fetch(API + "/" + id, {
    method: "DELETE"
  });

  getCoffees();
}

// carregar ao abrir
getCoffees();
