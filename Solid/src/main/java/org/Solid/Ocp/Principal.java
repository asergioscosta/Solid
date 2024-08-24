package org.Solid.Ocp;

public class Principal {

    private String relatorio;
    private Empresa empresa;

    public Principal(String nomeDepartamento) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.Solid.Ocp." + nomeDepartamento);
            objeto = classe.newInstance();
        } catch (Exception e) {
            this.relatorio = null;
        }
        if (!(objeto instanceof Empresa)) {
            this.empresa = null;
        }
        this.empresa = (Empresa) objeto;
    }

    public String getRelatorio() {
        return relatorio;
    }

    public void setRelatorio(String relatorio) {
        this.relatorio = relatorio;
    }

    public void imprimir() {
        this.empresa.imprimir(relatorio);
    }
}
