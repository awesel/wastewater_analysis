# pylint: disable=too-many-arguments
# pylint: disable=unused-variable
def read_files(file1, file2, file3, file4, file5, file6):
    content1 = None
    content2 = None
    content3 = None
    content4 = None
    content5 = None
    content6 = None

    try:
        # Read the contents of file1
        with open(file1, "r") as f:
            content1 = f.read()

        # Read the contents of file2
        with open(file2, "r") as f:
            content2 = f.read()

        # Read the contents of file3
        with open(file3, "r") as f:
            content3 = f.read()

        # Read the contents of file4
        with open(file4, "r") as f:
            content4 = f.read()

        # Read the contents of file5
        with open(file5, "r") as f:
            content5 = f.read()

        # Read the contents of file6
        with open(file6, "r") as f:
            content6 = f.read()
        
        combined_content = content6 + content5 + content4 + content3 + content2 + content1

        # Write the combined contents to a new file
        with open("big.fastq", "w") as f:
            f.write(combined_content)

    except FileNotFoundError as e:
        print(f"File not found: {e}")
read_files("Alpha.1.fastq", "Beta.1.fastq", "Delta.1.fastq", "Gamma.1.fastq", "Omicron_BA.2.1.fastq", "Omicron_BA.5.1.fastq")
