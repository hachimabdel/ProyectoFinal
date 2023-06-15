$(document).ready(function () {
    $('#myForm').submit(function (event) {
        event.preventDefault();
        var name = $('#name').val();
        var lastname = $('#lastname').val();
        var date = $('#date').val();
        var password = $('#password').val();

        var nameRegex = /^[A-Za-z]+$/;
        var lastnameRegex = /^[A-Za-z]+$/;

        if (!nameRegex.test(name)) {
            Swal.fire('Error', 'Por favor ingrese un nombre válido (solo letras).', 'error');
            return false;
        }

        if (!lastnameRegex.test(lastname)) {
            Swal.fire('Error', 'Por favor ingrese un apellido válido (solo letras).', 'error');
            return false;
        }

        if (date === '') {
            Swal.fire('Error', 'Por favor ingrese una fecha.', 'error');
            return false;
        }

        if (password === '') {
            Swal.fire('Error', 'Por favor ingrese una contraseña.', 'error');
            return false;
        }

        if (!isFirstLetterCapital(password)) {
            Swal.fire('Error', 'Por favor cambie la contraseña, la primera letra debe ser mayúscula.', 'error');
            return false;
        }

        Swal.fire('Éxito', 'Formulario enviado correctamente.', 'success');
    });

    function isFirstLetterCapital(str) {
        var firstLetter = str.charAt(0);
        return firstLetter === firstLetter.toUpperCase();
    }
});



