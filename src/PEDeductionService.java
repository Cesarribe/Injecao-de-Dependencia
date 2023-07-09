public class PEDeductionService implements DeductionService {
//metodo especifico para o Estado de Pernambuco
    @Override
    public double deduction(double amount) {
        return amount * 0.12;
    }
}
