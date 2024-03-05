import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpleadorBR {
    private float salarioBase;
    private float salarioNeto;

    public EmpleadorBR() {
        this.salarioNeto = 0;
    }

    public float getSalarioNeto() {
        return salarioNeto;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float setSalarioNeto(float salarioNeto) {
        this.salarioNeto = salarioNeto;
        return salarioNeto;
    }

    public float calculaSalarioBruto(TipoEmpleado tipus, float ventasMes, float horasExtra) {
        if (tipus == null || ventasMes < 0 || horasExtra < 0) {
            return -1;

        } else {
            if (tipus == TipoEmpleado.venedor) {
                salarioBase = 1000;
            } else if (tipus == TipoEmpleado.encarregat) {
                salarioBase = 1500;
            }
            if (ventasMes >= 1500) {
                salarioBase += 200;
            } else if (ventasMes >= 1000) {
                salarioBase += 100;
            }
            return salarioBase += (horasExtra * 20);
        }

    }

    public float calculaSalarioNeto(float salarioBruto) {
        if (salarioBruto >= 1000 && salarioBruto < 1500){
            salarioBruto = (float) (salarioBruto * 0.84);
        } else if (salarioBruto >= 1500){
            salarioBruto = (float) (salarioBruto * 0.82);
        }
        if (salarioBruto < 0){
            return -1;
        } else {
            return salarioBruto;
        }
    }

}
