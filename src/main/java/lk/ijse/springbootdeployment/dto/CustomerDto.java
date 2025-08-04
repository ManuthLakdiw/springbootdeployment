package lk.ijse.springbootdeployment.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author manuthlakdiv
 * @email manuthlakdiv2006.com
 * @project springbootdeployment
 * @github https://github.com/ManuthLakdiw
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CustomerDto {
    private String id;
    private String name;
    private String address;
}
