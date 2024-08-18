/*
 * @author : xCODE
 * Project : project04
 * Date    : 8/18/2024 (Sunday)
 * Time    : 8:41 AM
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
public class CustomerDTO {
    private String cus_id;
    private String cus_name;
    private String cus_address;
    private double cus_Salary;
}
