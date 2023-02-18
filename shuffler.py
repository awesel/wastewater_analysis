import random

def shuffle_file_contents(file_name):
    try:
        with open(file_name, "r") as f:
            lines = f.readlines()

        # Split the lines into 4-line groups
        groups = [lines[i:i + 4] for i in range(0, len(lines), 4)]

        # Shuffle the groups
        random.shuffle(groups)

        # Write the shuffled groups to a new file
        with open("shuffled.fastq", "w") as f:
            for group in groups:
                for line in group:
                    f.write(line)

    except FileNotFoundError as e:
        print(f"File not found: {e}")

shuffle_file_contents("backwards_order.fastq")