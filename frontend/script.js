document.addEventListener("DOMContentLoaded", () => {
    mostrarPantalla("mockup-home");


    const password = document.getElementById("password");
    const eye = document.getElementById("togglePassword");

    if (password && eye) {
        eye.addEventListener("click", () => {
            password.type = 
            password.type === "password" ? "text" : "password";
        });
    }


    const inputs = document.querySelectorAll(".codigo-inputs input");

    inpts.forEach((input, index) => {
        input.addEventListener("input", () => {
            if (input.value && inputs[index + 1]) {
                inputs[index + 1].focus();
            }
            });
        });
    });


    function mostrarPantalla (id) {
        document.querySelectorAll(".pantalla").forEach(p => {
            p.classList.remove("activa");
        });

        const pantalla = document.getElementById(id);
        if (pantalla) {
            pantalla.classList.add("activa");
            window.scrollTo(0, 0);
        }
    };


    const inputsCodigo = document.querySelectorAll('.codigo-inputs input');

    inputsCodigo.forEach((input, index) => {
        input.addEventListener('input', () => {
            if (input.value && inputsCodigo[index + 1]) {
                inputsCodigo[index + 1].focus();
            }
        });
    });


    function togglePassword(inputId, icon) {
        const input = document.getElementById(inputId);

        if (input.type === "password") {
            input.type = "text";
            icon.style.opacity = "1";
        } else {
            input.type = "password";
            icon.style.opacity = "0.7";
        }
    };


    document.querySelectorAll(".role").forEach(role => {
        role.addEventListener("click", () => {
            document.querySelectorAll("role").forEach(r => r.classList.remove("selected"));
            role.classList.add("selected");
        });
    });


    document.querySelector('#mockup-6 .btn-yellow')
    .addEventListener('click', () => {
        alert('Datos enviados correctamente');
    });


    const riskButtons = document.querySelectorAll('.risk-btn');

    riskButtons.forEach(btn => {
        btn.addEventListener('click', () => {
            riskButtons.forEach(b => b.classList.remove('activo'));
            btn.classList.add('activo');
        });
    });


    function togglePassword(id) {
        const input = document.getElementById(id);
        input.type = input.type === "password" ? "text" : "password";
    }

    document.addEventListener("DOMContentLoaded", () => {
  const goToLogin = document.getElementById("goToLogin");

  if (goToLogin) {
    goToLogin.addEventListener("click", (e) => {
      e.preventDefault();
      window.location.href = "index.html";
    });
  }
});


function irInspecciones() {
  document.querySelectorAll('.pantalla').forEach(p => p.classList.remove('activa'));
  document.getElementById('mockup-inspecciones').classList.add('activa');
};

const menuToggle = document.getElementById("menuToggle");
const menuDropdown = document.getElementById("menuDropdown");

if (menuToggle) {
  menuToggle.addEventListener("click", () => {
    menuDropdown.style.display =
      menuDropdown.style.display === "flex" ? "none" : "flex";
  });
}

document.addEventListener("click", (e) => {
  if (!e.target.closest(".menu-wrapper")) {
    if (menuDropdown) menuDropdown.style.display = "none";
  }
});

function nuevaInspeccion() {
  alert("Ir a nueva inspección");
}

function filtrarInspecciones(estado) {
  document.querySelectorAll(".inspeccion-card").forEach(card => {
    const estadoCard = card.querySelector(".estado");

    if (!estadoCard) return;

    if (estadoCard.classList.contains(estado)) {
      card.style.display = "flex";
    } else {
      card.style.display = "none";
    }
  });
}

function salir() {
  mostrarPantalla("login");
}



function nuevaInspeccion() {
  document.querySelectorAll('.pantalla').forEach(p => {
    p.classList.remove('activa');
  });

  document
    .getElementById('mockup-inspeccion-detalle')
    .classList.add('activa');

  window.scrollTo(0, 0);
}

document.querySelectorAll(
  '.btn-adjuntar1, .btn-adjuntar2, .btn-adjuntar3'
).forEach(btn => {
  btn.addEventListener('click', () => {
    btn.classList.toggle('activo');

    btn.textContent = btn.classList.contains('activo')
      ? 'Imagen adjunta ✔'
      : 'Adjuntar imagen';
  });
});

const btnSiguiente = document.querySelector(
   '#mockup-inspeccion-detalle .btn-siguiente'
  );

if (btnSiguiente) {
  btnSiguiente.addEventListener('click', () => {
    const obligatorios = document.querySelectorAll(
      '#mockup-inspeccion-detalle select, #mockup-inspeccion-detalle input'
    );

    let valido = true;

    obligatorios.forEach(campo => {
      if (
        campo.tagName !== 'TEXTAREA' &&
        !campo.disabled &&
        campo.value.trim() === ''
      ) {
        valido = false;
        campo.style.borderColor = '#c62828';
      } else {
        campo.style.borderColor = '#d0d0d0';
      }
    });

    if (!valido) {
      alert('Por favor complete todos los campos obligatorios');
      return;
    }

    alert('Inspección guardada correctamente');
  });
}

document.querySelectorAll('.pantalla').forEach(p =>
      p.classList.remove('activa')
    );
    document
      .getElementById('mockup-inspeccion-checklist')
      .classList.add('activa');
    window.scrollTo(0, 0);
  



function irChecklist() {
  document.querySelectorAll('.pantalla').forEach(p => p.classList.remove('activa'));
  document.getElementById('mockup-inspeccion-checklist').classList.add('activa');
  window.scrollTo(0, 0);
}

function volverDetalle() {
  document.querySelectorAll('.pantalla').forEach(p => p.classList.remove('activa'));
  document.getElementById('mockup-inspeccion-detalle').classList.add('activa');
  window.scrollTo(0, 0);
}


function irIncidentes() {
  document.querySelectorAll('.pantalla').forEach(p =>
    p.classList.remove('activa')
  );
  document.getElementById('mockup-incidentes').classList.add('activa');
  window.scrollTo(0, 0);
}

function filtrarIncidentes(texto) {
  texto = texto.toLowerCase();

  document.querySelectorAll('.incidente-card').forEach(card => {
    const contenido = card.innerText.toLowerCase();
    card.style.display = contenido.includes(texto) ? 'flex' : 'none';
  });
}

const menuIncidentesToggle = document.getElementById("menuIncidentesToggle");
const menuIncidentesDropdown = document.getElementById("menuIncidentesDropdown");

if (menuIncidentesToggle) {
  menuIncidentesToggle.addEventListener("click", () => {
    menuIncidentesDropdown.style.display =
      menuIncidentesDropdown.style.display === "flex" ? "none" : "flex";
  });
}

document.addEventListener("click", (e) => {
  if (!e.target.closest("#mockup-incidentes .menu-wrapper")) {
    if (menuIncidentesDropdown) menuIncidentesDropdown.style.display = "none";
  }
});

function nuevoIncidente() {
  document.querySelectorAll('.pantalla').forEach(p =>
    p.classList.remove('activa')
  );

  document
    .getElementById('mockup-incidente-nuevo')
    .classList.add('activa');

  window.scrollTo(0, 0);
}

function filtrarIncidentesEstado(estado) {
  document.querySelectorAll("#mockup-incidentes .incidente-card").forEach(card => {
    const estadoCard = card.querySelector(".estado");
    if (!estadoCard) return;

    card.style.display = estadoCard.classList.contains(estado)
      ? "flex"
      : "none";
  });
}

function salirIncidentes() {
  mostrarPantalla("mockup-home");
}


function irSeguimientoIncidente() {
  document.querySelectorAll('.pantalla').forEach(p =>
    p.classList.remove('activa')
  );
  document
    .getElementById('mockup-incidente-seguimiento')
    .classList.add('activa');

  window.scrollTo(0, 0);
}

function volverNuevoIncidente() {
  document.querySelectorAll('.pantalla').forEach(p =>
    p.classList.remove('activa')
  );
  document
    .getElementById('mockup-incidente-nuevo')
    .classList.add('activa');

  window.scrollTo(0, 0);
}


function irCapacitaciones() {
  document.querySelectorAll('.pantalla').forEach(p =>
    p.classList.remove('activa')
  );
  document.getElementById('mockup-capacitaciones').classList.add('activa');
  window.scrollTo(0, 0);
}

function filtrarCapacitaciones(texto) {
  texto = texto.toLowerCase();
  document.querySelectorAll('.capacitacion-card').forEach(card => {
    card.style.display = card.innerText.toLowerCase().includes(texto)
      ? 'block'
      : 'none';
  });
}

function filtrarEstadoCap(estado) {
  document.querySelectorAll('.capacitacion-card').forEach(card => {
    if (estado === 'todas') {
      card.style.display = 'block';
    } else {
      card.style.display = card.classList.contains(estado)
        ? 'block'
        : 'none';
    }
  });

  document.querySelectorAll('.filtros-capacitaciones button')
    .forEach(b => b.classList.remove('activo'));
  event.target.classList.add('activo');
}


function nuevaCapacitacion() {
  document.querySelectorAll('.pantalla').forEach(p =>
    p.classList.remove('activa')
  );

  document
    .getElementById('mockup-capacitacion-nueva')
    .classList.add('activa');

  window.scrollTo(0, 0);
}

function irLogin() {
  document.querySelectorAll('.pantalla').forEach(p => {
    p.classList.remove('activa');
  });

  document.getElementById('login').classList.add('activa');
  window.scrollTo(0, 0);
}















