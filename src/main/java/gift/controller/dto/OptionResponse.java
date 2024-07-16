package gift.controller.dto;

import jakarta.validation.constraints.NotNull;

public class OptionResponse {
    @NotNull
    Long id;
    @NotNull
    String name;
    @NotNull
    int quantity;

    public OptionResponse(Long id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }
}