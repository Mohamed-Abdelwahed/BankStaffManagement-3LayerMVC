package com.datawrite.tets_data_path.repository;

import com.datawrite.tets_data_path.Staff;

import java.util.ArrayList;
import java.util.List;

public class StaffRepository {
        List<Staff> allEmp = new ArrayList<>();

        public Staff geEmpByIndex(int index){
            return allEmp.get(index);
        } 


        public void addEmp(Staff staff){
            allEmp.add(staff);
        }

        public void updateEmp(Staff staff , int index){
            allEmp.set(index, staff);
        }

        public List<Staff> getAllEmp(){
            return allEmp;
        }


        /** add remove from staff */
        public void removeEmployee(int index){
            allEmp.remove(index);
        }


        

}
