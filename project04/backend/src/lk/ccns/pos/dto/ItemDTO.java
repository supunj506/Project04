/*
 * @author : xCODE
 * Project : project04
 * Date    : 8/18/2024 (Sunday)
 * Time    : 8:42 AM
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
public class ItemDTO {
    private String item_code;
    private String item_desc;
    private double item_price;
    private double item_qty;
}
