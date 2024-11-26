<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Extracurricular Management System</title>
    <link rel="stylesheet" href="css/index.css"> <!-- Link to your CSS file -->
</head>
<body>
    <header>
        <div class="logo">
            <h1><image src="images/klu.jpeg" id="img_hero"></h1> <!-- Replace with actual logo -->
        </div>
        <nav>
            <ul>
                <li><a href="/">Home</a></li>
                <li><a href="#">About Us</a></li>
                <li><a href="#">Activities</a></li>
                <li><a href="#">Events</a></li>
                <li><a href="#">Resources</a></li>
                <li><a href="#">Contact Us</a></li>
                <li><a href="alllogin">Login</a></li>
            </ul>
        </nav>
    </header>

    <main>
        <section class="banner">
            <h2>Welcome to the Student Extracurricular Management System</h2>
            <p>Empowering Student Engagement Beyond the Classroom</p>
            <button onclick="location.href='alllogin'">Join an Activity</button>
        </section>

        <section class="features">
            <h3>Features</h3>
            <ul>
                <li><strong>Discover Activities:</strong> Explore a variety of extracurricular options tailored to your interests.</li>
                <li><strong>Event Calendar:</strong> Stay updated on upcoming events and important dates.</li>
                <li><strong>Join Clubs:</strong> Easily sign up for clubs and organizations.</li>
                <li><strong>Track Participation:</strong> Monitor your involvement and achievements.</li>
                <li><strong>Resources:</strong> Access materials to help you succeed in your extracurricular endeavors.</li>
            </ul>
        </section>

        <section class="upcoming-events">
            <h3>Upcoming Events</h3>
            <ul>
                <li>Event 1 - Date & Description</li>
                <li>Event 2 - Date & Description</li>
                <li>Event 3 - Date & Description</li>
                <li><a href="alllogin">View All Events</a></li>
            </ul>
        </section>

        <section class="testimonials">
            <h3>What Students Say</h3>
            <blockquote>"Joining the debate club changed my life!" - Student A</blockquote>
            <blockquote>"I've made so many friends through sports!" - Student B</blockquote>
        </section>

        <section class="call-to-action">
            <h3>Get Involved!</h3>
            <button onclick="location.href='alllogin'">Join Now</button>
        </section>
    </main>

    <footer>
        <div class="footer-links">
            <a href="#">Privacy Policy</a>
            <a href="#">Terms of Service</a>
            <a href="#">FAQ</a>
            <a href="#">Social Media</a>
        </div>
        <div class="contact-info">
            <p>Contact us: email@example.com | Phone: (123) 456-7890</p>
        </div>
    </footer>
</body>
</html>
