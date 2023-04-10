public class AddRess {
    public int tinh;
    public String huyen;
    public String xa;
    public int sonha;

    public AddRess(int tinh, String huyen, String xa, int sonha) {
        this.tinh = tinh;
        this.huyen = huyen;
        this.xa = xa;
        this.sonha = sonha;
    }

    public AddRess() {
    }

    public int getTinh() {
        return tinh;
    }

    public void setTinh(int tinh) {
        this.tinh = tinh;
    }

    public String getHuyen() {
        return huyen;
    }

    public void setHuyen(String huyen) {
        this.huyen = huyen;
    }

    public String getXa() {
        return xa;
    }

    public void setXa(String xa) {
        this.xa = xa;
    }

    public int getSonha() {
        return sonha;
    }

    public void setSonha(int sonha) {
        this.sonha = sonha;
    }

    @Override
    public String toString() {
        return "AddRess{" +
                "tinh=" + tinh +
                ", huyen='" + huyen + '\'' +
                ", xa='" + xa + '\'' +
                ", sonha=" + sonha +
                '}';
    }
}
