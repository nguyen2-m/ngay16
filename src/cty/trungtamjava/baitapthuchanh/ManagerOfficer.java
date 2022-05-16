package cty.trungtamjava.baitapthuchanh;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManagerOfficer {
	private List<CanBo> officers;

    public ManagerOfficer() {
        this.officers = new ArrayList<>();
    }

    public void addOfficer(CanBo officer) {
        this.officers.add(officer);
    }

    public List<CanBo> searchOfficerByName(String name) {
        return this.CanBo.stream().filter(o -> o.getName().contains(name)).collect(Collectors.toList());
    }

    public void showListInforOfficer() {
        this.CanBo.forEach(o -> System.out.println(o.toString()));
    }

}
