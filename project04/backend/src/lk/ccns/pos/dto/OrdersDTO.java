/*
 * @author : xCODE
 * Project : project04
 * Date    : 8/18/2024 (Sunday)
 * Time    : 8:44 AM
 * For GDSE course of IJSE institute.
 */

package lk.ccns.pos.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrdersDTO {
    private String orderId;
    private String orderDate;
    private String cusId;
}
