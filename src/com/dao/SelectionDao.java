package com.dao;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.po.selection;
@Repository("selectionDao")
@Mapper
public interface SelectionDao {
    public selection selectSelectionById(Integer studentId);
    public List<selection> selectAllSelection();
    public int addSelection(selection sel);
    public int updateSelection(selection sel);
}