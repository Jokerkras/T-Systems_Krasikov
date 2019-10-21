package domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tariff {
    private String title;
    private double price;
    private Set<Option> possibleOptions = new HashSet<Option>();

    public Tariff(String title, double price, HashSet<Option> possibleOptions) {
        this.title = title;
        this.price = price;
        this.possibleOptions = possibleOptions;
    }

    public void addOption(Option option) {
        possibleOptions.add(option);
    }

    public boolean removeOption(Option option) {
        return possibleOptions.remove(option);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Set<Option> getPossibleOptions() {
        return possibleOptions;
    }

    public void setPossibleOptions(Set<Option> possibleOptions) {
        this.possibleOptions = possibleOptions;
    }
}
