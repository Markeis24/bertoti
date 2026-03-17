const API = "http://localhost:8080/coffees";

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

function showCup() {
  const cup = document.getElementById("cup");
  cup.classList.remove("hidden");

  setTimeout(() => {
    cup.classList.add("hidden");
  }, 800);
}

async function addCoffee() {
  const name = document.getElementById("name").value;

  if (!name) return;

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

  showCup();

  document.getElementById("name").value = "";
  getCoffees();
}

async function deleteCoffee(id) {
  await fetch(API + "/" + id, {
    method: "DELETE"
  });

  getCoffees();
}

getCoffees();
