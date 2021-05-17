public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				// Student
				StudentManager studentManager = new StudentManager();
				
				Student student = new Student(1, "beytullah", "hesaplanan", "beytullah@gmail.com", "123","istanbul");
				
				studentManager.add(student);
				
				student.setEmail("beytullah@gmail.com");
				studentManager.update(student);
				System.out.println("Güncellenen mail adresi => "+student.getEmail());
				
				studentManager.addAddress(student, "dortmund");
				
				studentManager.addComment("Ödev GitHuba yüklendi.");

				
				//Instructor
				InstructorManager instructorManager = new InstructorManager();
		
				Instructor instructor = new Instructor(1, "Engin", "Demirog", "engindemirog@gmail.com", "123456", "javacı");
					
				instructorManager.add(instructor);
				
				instructorManager.addCourse("Java");
				
				instructorManager.deleteCourse("Java");
				
			}

	}

