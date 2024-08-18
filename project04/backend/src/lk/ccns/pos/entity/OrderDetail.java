/*
 * @author : xCODE
 * Project : project04
 * Date    : 8/18/2024 (Sunday)
 * Time    : 8:49 AM
 * For GDSE course of IJSE institute.
 */

package lk.ccns.pos.entity;

import lombok.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class OrderDetail {
    @Id
    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "order_id")
    private Orders orders;

    @Id
    @ManyToOne
    @JoinColumn(name = "item_code", referencedColumnName = "item_code")
    private Item item;

    private double qty;
    private double price;


}
