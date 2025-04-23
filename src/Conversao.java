import com.google.gson.annotations.SerializedName;

public class Conversao {
    @SerializedName("base_code")
    private String base;
    @SerializedName("target_code")
    private String alvo;
    @SerializedName("conversion_result")
    private double resultado;

    public Conversao(String base, String alvo, double resultado) {
        this.base = base;
        this.alvo = alvo;
        this.resultado = resultado;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getAlvo() {
        return alvo;
    }

    public void setAlvo(String alvo) {
        this.alvo = alvo;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
