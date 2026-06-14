let form = document.querySelector('form');

form.addEventListener('submit', (e) => {
    e.preventDefault();

    let book = {
        name: document.getElementById('name').value,
        year: document.getElementById('year').value
    }

    fetch('http://localhost:8085/api/books/addBook', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(book)
    })
    .then(async response => {
        if (response.ok) {
            
            let message = await response.text();
            alert(message);
            form.reset();
        }
    })
})