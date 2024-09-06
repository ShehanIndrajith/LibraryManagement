package JFrame;

import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Date;

public class DBConnector {
     Connection connection;
    String connectionString = "jdbc:mysql://localhost:3306/library";
    String userName = "root";
    String password = "";

    public DBConnector() throws SQLException {
        this.connect();
    }

    public void connect() throws SQLException {
        DriverManager.registerDriver(new Driver());
        this.connection = DriverManager.getConnection(this.connectionString, this.userName, this.password);
    }

    public int SignUP(String userName, String password, String email, String contact) throws SQLException {
        String sql = "INSERT INTO admin (name, password, email, contact) VALUES (?, ?, ?, ?)";
        PreparedStatement ps = this.connection.prepareStatement(sql);
        ps.setString(1, userName);
        ps.setString(2, password);
        ps.setString(3, email);
        ps.setString(4, contact);
        return ps.executeUpdate();
    }

    public boolean Loging(String email, String password) throws SQLException {
        String sql = "SELECT * FROM admin WHERE email = ? AND password = ?";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        preparedStatement.setString(1, email);
        preparedStatement.setString(2, password);
        ResultSet resultSet = preparedStatement.executeQuery();
        return resultSet.next();
    }

    public boolean CheckDublicate(String email) throws SQLException {
        String sql = "SELECT * FROM admin WHERE email = ?";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        preparedStatement.setString(1, email);
        ResultSet resultSet = preparedStatement.executeQuery();
        return resultSet.next();
    }

    public String GetName(String email) throws SQLException {
        String sql = "SELECT name FROM admin WHERE email = ?";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        preparedStatement.setString(1, email);
        ResultSet rs = preparedStatement.executeQuery();
        if (rs.next()) {
            return rs.getString("name");
        }
        return null;
    }
    
    public int AddStudent(String studentName, String address, String email, String contact) throws SQLException {
    String sql = "INSERT INTO student (studentName, address, email, contact) VALUES (?, ?, ?, ?)";
    PreparedStatement ps = this.connection.prepareStatement(sql);
    ps.setString(1, studentName);
    ps.setString(2, address);
    ps.setString(3, email);
    ps.setString(4, contact);
    return ps.executeUpdate();
}
    
    public int DeleteStudentByID(int stID) throws SQLException {
    String sql = "DELETE FROM student WHERE studentId = ?";
    PreparedStatement ps = this.connection.prepareStatement(sql);
    ps.setInt(1, stID);
    return ps.executeUpdate();
}



    public Object[][] BookIssueTable() throws SQLException {
        String sql = "SELECT * FROM bookissue";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();
        int rows = this.NOofIssuedBook();
        Object[][] data = new Object[rows][columnCount];

        for (int row = 0; resultSet.next(); row++) {
            for (int i = 1; i <= columnCount; i++) {
                data[row][i - 1] = resultSet.getObject(i);
            }
        }
        return data;
    }

    public Object[][] StudentDetails() throws SQLException {
        String sql = "SELECT * FROM student";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();
        int rows = this.NoofStudent();
        Object[][] data = new Object[rows][columnCount];

        for (int row = 0; resultSet.next(); row++) {
            for (int i = 1; i <= columnCount; i++) {
                data[row][i - 1] = resultSet.getObject(i);
            }
        }

        return data;
    }
    
    public int lastStudenID () throws SQLException {
         int stID = -1;
        String sql = "SELECT studentId from student ORDER BY studentId DESC LIMIT 1";
        try (PreparedStatement stmt = connection.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {
        
        if (rs.next()) {
            stID = rs.getInt("studentId");
        }
    }
    
    return stID;
    }
    
    public Student getStudentDetails(int stID) throws SQLException {
    String sql = "SELECT studentName, address, email, contact FROM student WHERE studentId = ?";
    Student student = null;
    
    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
        stmt.setInt(1, stID);
        ResultSet rs = stmt.executeQuery();
        
        if (rs.next()) {
            // Create a Student object to store fetched details
            student = new Student();
            student.setName(rs.getString("studentName"));
            student.setAddress(rs.getString("address"));
            student.setEmail(rs.getString("email"));
            student.setContactNo(rs.getString("contact"));
        }
    }
    
    return student;
}
    
    public Books getBookDetails(int bookID) throws SQLException {
    String sql = "SELECT name, author, date, quantity FROM book WHERE bookID = ?";
    Books book = null;
    
    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
        stmt.setInt(1, bookID);
        ResultSet rs = stmt.executeQuery();
        
        if (rs.next()) {
            // Create a Student object to store fetched details
            book = new Books();
            book.setBookID(bookID);
            book.setBookName(rs.getString("name"));
            book.setAuthor(rs.getString("author"));
            book.setDate(rs.getString("date"));
            book.setQuantity(rs.getInt("quantity"));
        }
    }
    
    return book;
}
    
    public void updateStudentDetails(int stID, String name, String address, String email, String contactNo) throws SQLException {
    String sql = "UPDATE student SET studentName = ?, address = ?, email = ?, contact = ? WHERE studentId = ?";
    
    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
        stmt.setString(1, name);
        stmt.setString(2, address);
        stmt.setString(3, email);
        stmt.setString(4, contactNo);
        stmt.setInt(5, stID);
        
        stmt.executeUpdate();
    }
}

    
    public boolean CheckStudentID(int id) throws SQLException {
    String sql = "SELECT * FROM student WHERE studentId = ?";
    PreparedStatement ps = this.connection.prepareStatement(sql);
    ps.setInt(1, id);
    ResultSet rs = ps.executeQuery();
    return rs.next(); // Returns true if a record is found
}
    
            
    public boolean CheckBookID(int bookID) throws SQLException {
    String sql = "SELECT * FROM book WHERE bookID = ?";
    PreparedStatement ps = this.connection.prepareStatement(sql);
    ps.setInt(1, bookID);
    ResultSet rs = ps.executeQuery();
    return rs.next(); // Returns true if a record is found
}

    public Object[][] BookDetais() throws SQLException {
        String sql = "SELECT * FROM book";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();
        int rows = this.NOofBooks();
        Object[][] data = new Object[rows][columnCount];

        for (int row = 0; resultSet.next(); row++) {
            for (int i = 1; i <= columnCount; i++) {
                data[row][i - 1] = resultSet.getObject(i);
            }
        }

        return data;
    }

    public int NoofStudent() throws SQLException {
        String sql = "SELECT COUNT(*) FROM student";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        ResultSet rs = preparedStatement.executeQuery();
        if (rs.next()) {
            return rs.getInt(1);
        }
        return 0;
    }

    public int NOofBooks() throws SQLException {
        String sql = "SELECT COUNT(*) FROM book";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        ResultSet rs = preparedStatement.executeQuery();
        if (rs.next()) {
            return rs.getInt(1);
        }
        return 0;
    }

    public int NOofIssuedBook() throws SQLException {
        String sql = "SELECT COUNT(*) FROM bookissue";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        ResultSet rs = preparedStatement.executeQuery();
        if (rs.next()) {
            return rs.getInt(1);
        }
        return 0;
    }

    public int IssueBook(int bookId, int studentId, String returnDate) throws SQLException {
    // SQL query for inserting the book issue details
    String sql = "INSERT INTO bookissue (bookId, date, returnDate, studentID) VALUES (?, NOW(), ?, ?)";
    
    // Prepare the statement with the query
    PreparedStatement ps = this.connection.prepareStatement(sql);
    ps.setInt(1, bookId);
    ps.setString(2, returnDate);
    ps.setInt(3, studentId);
    
    // Execute the update and return the status
    return ps.executeUpdate();
}


    public int AddBook(int bookID, String bookName, String author, String date, int quantity) throws SQLException {
        String sql = "INSERT INTO book (bookID, name, author, date, quantity) VALUES (?,?, ?, ?, ?)";
        PreparedStatement ps = this.connection.prepareStatement(sql);
        ps.setInt(1,bookID);
        ps.setString(2, bookName);
        ps.setString(3, author);
        ps.setString(4, date);
        ps.setInt(5, quantity);
        return ps.executeUpdate();
    }

    public int RemoveBook(int bookId) throws SQLException {
        String sql = "DELETE FROM book WHERE bookID = ?";
        PreparedStatement ps = this.connection.prepareStatement(sql);
        ps.setInt(1, bookId);
        return ps.executeUpdate();
    }

    public int EditBookDetails(int bookId, String name, String author, String date, int quantity) throws SQLException {
        String sql = "UPDATE book SET name = ?, author = ?, date = ?, quantity = ? WHERE bookID = ?";
        PreparedStatement ps = this.connection.prepareStatement(sql);
        ps.setString(1, name);
        ps.setString(2, author);
        ps.setString(3, date);
        ps.setInt(4, quantity);
        ps.setInt(5, bookId);
        return ps.executeUpdate();
    }

    public int BookRelease(int bookId, int studentId) throws SQLException {
        String sql = "DELETE FROM bookissue WHERE bookId = ? AND studentID = ?";
        PreparedStatement ps = this.connection.prepareStatement(sql);
        ps.setInt(1, bookId);
        ps.setInt(2, studentId);
        return ps.executeUpdate();
    }
    
    public String ChangeBookDeatails(int bookID){
        String a ="fgfg";
        return a;
    }
}
