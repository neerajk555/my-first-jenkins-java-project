#!/bin/bash

echo "🔨 Starting build process..."
echo "📁 Current directory: $(pwd)"
echo "☕ Java Version: $(java -version 2>&1 | head -n 1)"

# Clean and compile
echo "🧹 Cleaning previous builds..."
mvn clean

echo "🔧 Compiling source code..."
mvn compile

echo "🧪 Running tests..."
mvn test

echo "📦 Creating JAR package..."
mvn package

echo "✅ Build completed successfully!"
echo "📄 JAR file location: target/my-first-jenkins-java-project-1.0-SNAPSHOT.jar"

# Run the application
echo "🚀 Running the application..."
java -jar target/my-first-jenkins-java-project-1.0-SNAPSHOT.jar