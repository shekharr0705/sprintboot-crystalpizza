package com.crystalpizaa.api.service.models.requestresponse;

import com.crystalpizaa.api.service.models.core.PriceModel;
import com.crystalpizaa.api.service.models.core.User;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.core.SpringVersion;

@Getter
@Setter
public class OrderResponse {

  private double Total;

  private Integer OrderId;

  private User CustomerDetails;

  private String DeliveryAddress;

  private List<PriceModel> Pizzas;

  private List<PriceModel> AddOns;

  public double getTotal() {
    double total = 0;

    for (PriceModel p : this.getPizzas()) {
      total += p.getTotal();
    }

    for (PriceModel p : this.getAddOns()) {
      total += p.getTotal();
    }
    return total;
  }

  private LocalDateTime OrderDate;

}
