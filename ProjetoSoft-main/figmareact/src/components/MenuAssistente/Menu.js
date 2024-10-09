import React from "react";
import { Link } from "react-router-dom"; // Importando Link
import styles from "./MenuAssistente.module.css";

function Menu() {
  const menuItems = [
    { text: "Gerenciar Usuario", path: "/gerenciarusuario" },
    { text: "Beneficiário", path: "/gerenciarbeneficiario" }, 
    { text: "Benefícios", path: "/beneficios" },
    { text: "Requisições", path: "/requisicaosecretaria" },
    { text: "Gerar Relatórios", path: "/relatoriosecretaria" }, 

  ];

  return (
    <nav className={styles.menuContainer}>
      {menuItems.map((item, index) => (
        <Link key={index} to={item.path} className={styles.menuItem}>
          {item.text}
        </Link>
      ))}
    </nav>
  );
}

export default Menu;
