package ru.neoflex.practice.model;
import jakarta.persistence.*;

@Entity
    public class CalculationResult {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private Integer result;
        @Column(name = "resu_lts", nullable = false)
        public Integer getResult() {
            return result;
        }
        public void setResult(int result) {
            this.result = result;
        }


        // геттеры, сеттеры и т.д.
    }

