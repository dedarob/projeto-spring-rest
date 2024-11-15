const formie = document.querySelector("form");
const input_name = document.querySelector("#username__input"); 
const input_email = document.querySelector("#email__input"); 
const input_password = document.querySelector("#password__register");

function register() {
    fetch("http://localhost:8080/users",
        {
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            method: "POST",
            body: JSON.stringify({
                name: input_name.value,
                email: input_email.value,
                password: input_password.value
            })
        }
    )
}

function clear() {
    input_name.value = ""
    input_email.value = ""
    input_password.value = ""

}

const registerButton = document.querySelector("#register__button");

registerButton.addEventListener('click', function (event) {
    event.preventDefault();
    register();
    clear();
});
