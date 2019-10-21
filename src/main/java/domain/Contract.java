package domain;

import java.util.HashSet;
import java.util.Set;

public class Contract {
    private Long number;
    private Tariff tariff;
    private Set<Option> options = new HashSet<Option>();

    public Contract(Long number, Tariff tariff, HashSet<Option> options) {
        this.number = number;
        this.tariff = tariff;
        this.options = options;
    }

    public void addOption(Option option) {
        options.add(option);
    }

    public boolean removeOption(Option option) {
        return options.remove(option);
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Tariff getTariff() {
        return tariff;
    }

    public void setTariff(Tariff tariff) {
        this.tariff = tariff;
    }

    public Set<Option> getOptions() {
        return options;
    }

    public void setOptions(Set<Option> options) {
        this.options = options;
    }
}
