function showMethod() {
    fetch("http://localhost:8080/course")
        .then(response => response.json())
        .then(courses => {
            const dataTable = document.getElementById("coursetable"); // corrected id

            courses.forEach(course => {
                const row = `
                    <tr>
                        <td>${course.courseId}</td>
                        <td>${course.courseName}</td>
                        <td>${course.trainerName}</td> <!-- Match your field name -->
                        <td>${course.duration}</td>
                    </tr>
                `;
                dataTable.innerHTML += row;
            });
        })
        .catch(error => {
            console.error("Error fetching courses:", error);
        });
}
