import React from "react";
import styles from "./ConsultarHistoricoAgen.module.css";
import Menu from "./Menu";
import Sidebar from "./Sidebar";

function ConsultarHistoricoAgen() {
  return (
    <main className={styles.container}>
      <section className={styles.card}>
        <div className={styles.content}>
          <div className={styles.column}>
            <Sidebar />
          </div>
          <div className={styles.column}>
            <Menu />
          </div>
        </div>
      </section>
    </main>
  );
}

export default ConsultarHistoricoAgen;
