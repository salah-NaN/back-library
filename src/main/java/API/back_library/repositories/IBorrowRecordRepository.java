package API.back_library.repositories;

import API.back_library.models.BorrowRecordModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBorrowRecordRepository extends JpaRepository<BorrowRecordModel, Long> {
}
