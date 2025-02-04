function copyEmail() {
    const email = document.createElement('textarea');
    email.value = document.querySelector('#contact span').textContent;
    document.body.appendChild(email);
    email.select();
    document.execCommand('copy');
    document.body.removeChild(email);
    alert('Email copiado al portapapeles');
}