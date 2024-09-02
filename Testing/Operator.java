public class Operator {
    int value_1;
    int value_2;
    int total;
    char operator;

    void sum(){
        this.total = this.value_1 + this.value_2;
    }
    void sub(){
        this.total = this.value_1 - this.value_2;
    }
    void multiply(){
        this.total = this.value_1 * this.value_2;
    }
    void divided(){
        this.total = this.value_1 / this.value_2;
    }

}
